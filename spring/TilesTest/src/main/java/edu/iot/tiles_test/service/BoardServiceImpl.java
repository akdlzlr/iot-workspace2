package edu.iot.tiles_test.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import edu.iot.tiles_test.model.Board;

@Service
public class BoardServiceImpl implements BoardService {

	@Override
	public Map<String, Object> list(int page) throws Exception {
		Map<String, Object> map = new HashMap<>();
		List<Board> list = new ArrayList<>();
		map.put("totalCount", 100);
		map.put("totalPage", 10);
		
		for(int i=0,ix=(page-1)*10+1;i<10;i++) {
			Board board = new Board();
			board.setTitle("title"+(ix+i));
			board.setWriter("ain1234");
			board.setContent("content"+(ix+i));
			list.add(board);
		}
		map.put("list", list);
		
		return map;
	}

	@Override
	public Board findById(long id) throws Exception {
		Board board = new Board();
		board.setTitle("title "+id);
		board.setWriter("ain1234");
		board.setContent("content"+id);
		return board;
	}

	@Override
	public void write(Board board) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Board board) throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(long id) throws Exception {
		// TODO Auto-generated method stub

	}

}
