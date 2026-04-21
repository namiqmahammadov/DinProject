    package com.namiq.libraryproject.service;

    import com.namiq.libraryproject.dao.entity.Book;
    import com.namiq.libraryproject.dao.entity.User;
    import com.namiq.libraryproject.dao.repository.BookRepository;
    import com.namiq.libraryproject.dao.repository.UserRepository;
    import com.namiq.libraryproject.exception.BookAlreadyExistsException;
    import com.namiq.libraryproject.exception.BookNotFoundException;
    import com.namiq.libraryproject.exception.UserAlreadyExistsException;
    import com.namiq.libraryproject.mapper.BookMapper;
    import com.namiq.libraryproject.mapper.UserMapper;
    import com.namiq.libraryproject.model.request.BookRequest;
    import com.namiq.libraryproject.model.response.BookResponse;
    import lombok.RequiredArgsConstructor;
    import org.springframework.stereotype.Service;

    import java.util.List;

    @Service
    @RequiredArgsConstructor
    public class BookServiceImp implements BookService{
        private final BookRepository bookRepository;
        private final UserRepository userRepository;

        @Override
        public BookResponse createBook(BookRequest bookRequest) {
     if(bookRepository.existsByIsbn(bookRequest.getIsbn())){
         throw new BookAlreadyExistsException("Kitab artiq movcuddur");
     }
     var bookEntity=BookMapper.toEntity(bookRequest);
     var savedBook= bookRepository.save(bookEntity);
            return BookMapper.toResponse(savedBook);
        }

        @Override
        public List<BookResponse> getAllBooks() {
            return bookRepository.findAll()
                    .stream()
                    .map(BookMapper::toResponse)
                    .toList();
        }

        @Override
        public BookResponse getBookById(Long id) {
            var book=  bookRepository.findById(id)
                    .orElseThrow(()->new BookNotFoundException("Kitab tapilmadi"));
            return  BookMapper.toResponse(book);
        }

        @Override
        public BookResponse updateBook(Long id, BookRequest bookRequest) {
            var book=  bookRepository.findById(id)
                    .orElseThrow(()->new BookNotFoundException("Kitab tapilmadi"));
            if (!book.getIsbn().equals(bookRequest.getIsbn())
                    && bookRepository.existsByIsbn(bookRequest.getIsbn())) {
                throw new BookAlreadyExistsException("Bu kitab artıq mövcuddur");
            }
            BookMapper.updateEntity(bookRequest,book);
            Book updatedBooks = bookRepository.save(book);
            return BookMapper.toResponse(updatedBooks);


        }

        @Override
        public void deleteBookById(Long id) {
            if (!bookRepository.existsById(id)) {
                throw new BookNotFoundException("Kitab tapılmadı");
            }

            bookRepository.deleteById(id);
        }

    }
