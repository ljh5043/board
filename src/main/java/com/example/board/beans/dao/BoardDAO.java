package com.example.board.beans.dao;

import com.example.board.beans.vo.BoardVO;
import com.example.board.mappers.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

//원격에서 수정함
@Repository //  컨테이너에 Bean 객체로 생성
@RequiredArgsConstructor    //  생성자로 주입입
public class BoardDAO {

//    @Autowired
    private final BoardMapper mapper;

//    게시글 작성
    public void register(BoardVO board){
        mapper.insertSelectKey_bno(board);
    }

//    게시글 상세정보
    public BoardVO get(Long bno){
        return mapper.read(bno);
    }

//    게시글 목록
    public List<BoardVO> getList(){
        return mapper.getList();
    }

//    게시글 수정
    public boolean modify(BoardVO board){
        return mapper.update(board) == 1;
    }

//    게시글 삭제
    public boolean remove(Long bno){
        return mapper.delete(bno) == 1;
    }

}
