package com.crud.dao;

import com.crud.bean.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class BoardDAO {
    @Autowired
    private JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    private final String BOARD_INSERT = "insert into BOARD (title, writer, content, regdate, category) values (?,?,?,?,?)";
    private final String BOARD_UPDATE = "update BOARD set title=?, writer=?, content=?, regdate=?, category=? where id=?";
    private final String BOARD_DELETE = "delete from BOARD  where id=?";
    private final String BOARD_GET = "select * from BOARD  where id=?";
    private final String BOARD_LIST = "select * from BOARD order by id desc";

    // 글 추가
    public int insertBoard(BoardVO vo) {
        return template.update(BOARD_INSERT, new Object[]{vo.getTitle(), vo.getWriter(), vo.getContent(), vo.getRegdate(), vo.getCategory()});
    }

    // 글 삭제
    public int deleteBoard(int id) {
        return template.update(BOARD_DELETE, new Object[]{id});
    }

    // 글 수정
    public int updateBoard(BoardVO vo) {
        return template.update(BOARD_UPDATE, new Object[]{vo.getTitle(), vo.getWriter(), vo.getContent(), vo.getRegdate(), vo.getCategory(), vo.getId()});
    }

    // 글 가져오기
    public BoardVO getBoard(int id) {
        return template.queryForObject(BOARD_GET,
                new BeanPropertyRowMapper<BoardVO>(BoardVO.class),new Object[] {id});
    }

    // 글 목록 가져오기
    public List<BoardVO> getBoardList(){
        return template.query(BOARD_LIST, new RowMapper<BoardVO>() {
                public BoardVO mapRow(ResultSet rs, int rowNum) throws SQLException {
                    BoardVO data = new BoardVO();
                    data.setId(rs.getInt("id"));
                    data.setTitle(rs.getString("title"));
                    data.setWriter(rs.getString("writer"));
                    data.setContent(rs.getString("content"));
                    data.setRegdate(rs.getDate("regdate"));
                    data.setCategory(rs.getString("category"));
                    return data;
                }
        });
    }
}
