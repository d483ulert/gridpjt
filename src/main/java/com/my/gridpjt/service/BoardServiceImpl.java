package com.my.gridpjt.service;
import com.my.gridpjt.domain.BoardVO;
import com.my.gridpjt.Board.BoardMapper;
import com.my.gridpjt.service.BoardService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@AllArgsConstructor
@Log4j
@Service
public class BoardServiceImpl {

	@Autowired
	private BoardMapper mapper;
	
	@Override
	public void register(BoardVO board) {
		mapper.insertSelectKey(board);
	}
	@Override
	public List<BoardVO> getList(){
		return mapper.getList();
	}
	@Override
	public boolean remove(Long bno) {
		return mapper.delete(bno)==1;
	}
	@Override
	public boolean modify(BoardVO board) {
		return mapper.update(board)==1;
	}
}
