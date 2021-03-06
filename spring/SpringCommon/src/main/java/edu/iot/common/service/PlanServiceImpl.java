package edu.iot.common.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.iot.common.dao.PlanDao;
import edu.iot.common.model.Pagination;
import edu.iot.common.model.Plan;

@Service
public class PlanServiceImpl implements PlanService {
	@Autowired
	PlanDao dao;

	@Override
	public Map<String, Object> getPage(int page) throws Exception {
		Map<String, Object> map = new HashMap<>();

		int total = dao.count();
		Pagination pagination = new Pagination(page, total);
		map.put("pagination", pagination);
		map.put("list", dao.getPage(pagination.getPageMap()));
		return map;
	}

	@Override
	public void create(Plan plan) throws Exception {
		dao.insert(plan);
	}

	@Override
	public List<Plan> getList(String userId) throws Exception {
		return dao.getList(userId);
	}

	@Override
	public Plan findById(long planId) throws Exception {
		return dao.findById(planId);
	}

	@Override
	public void delete(long planId) throws Exception {
		dao.delete(planId);
	}

	@Override
	public void update(Plan plan) throws Exception {
		dao.update(plan);
		
	}

}
