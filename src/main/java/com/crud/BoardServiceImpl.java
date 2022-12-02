package com.crud;

import com.crud.bean.BoardVO;
import com.crud.dao.BoardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{
    @Autowired
    BoardDAO boardDAO;

    public int insertBoard(BoardVO vo) {
        return boardDAO.insertBoard(vo);
    }
    public int deleteBoard(int id) {
        return boardDAO.deleteBoard(id);
    }
    public int updateBoard(BoardVO vo) {
        return boardDAO.updateBoard(vo);
    }
    public BoardVO getBoard(int id) {
        return boardDAO.getBoard(id);
    }
    public List<BoardVO> getBoardList() {
        return boardDAO.getBoardList();
    }
}
