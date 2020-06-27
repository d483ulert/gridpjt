package com.my.gridpjt.Board;

import java.util.List;
import org.springframework.stereotype.Repository;
import com.my.gridpjt.domain.BoardVO;

@Repository
public interface BoardMapper {

	//insert
	public List<BoardVO> getList();
	public void insert(BoardVO board);
	public void insertSelectKey(BoardVO board);
	public BoardVO read(Long bno);
	
	//delete
	public int delete(Long bno);
	
	public int update(BoardVO board);
}
