package com.namiq.taskforjdbc.dao.repository;

import com.namiq.taskforjdbc.dao.entity.CardEntity;
import com.namiq.taskforjdbc.enums.StatusCode;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CardRepository {
    private final JdbcTemplate jdbcTemplate;


    public void save(CardEntity entity) {
        String sql = " insert into  cards( holder_name, pan, cvv, expiry_date, balance, status) values (?,?,?,?,?,?)";
        jdbcTemplate.update(connection -> {
            var ps = connection.prepareStatement(sql);
            ps.setString(1, entity.getHolder_name());
            ps.setString(2, entity.getPan());
            ps.setString(3, entity.getCvv());
            ps.setDate(4, entity.getExpiryDate());
            ps.setDouble(5, entity.getBalance());
            ps.setString(6, entity.getStatus().name());
            return ps;
        });

    }

    public void blockCard(Integer id) {
        String sql = "update cards set status=? where id=?";
        jdbcTemplate.update(sql, StatusCode.BLOCKED.name(), id);
    }

    public void updateCardExpiryDate(Integer id, Date expiryDate) {
        String sql = "update cards set expiry_date=? where id=?";
        jdbcTemplate.update(sql, expiryDate, id);
    }

    public void increaseBalance(Integer id, Double amount) {
        String sql = "update cards set balance=balance+? where id=?";
        jdbcTemplate.update(sql, amount, id);
    }

    public void unblockCard(Integer id) {
        String sql = "update cards set status=? where id=?";
        jdbcTemplate.update(sql, StatusCode.ACTIVE.name(), id);
    }

}
