package com.wipro.Project_service.service;


import com.wipro.Project_service.entity.College;

import java.util.List;

public interface CollegeService {
    College addCollege(College college);
    List<College> getAllColleges();
    College getCollegeById(Long id);
    College getCollegeByName(String name);
    College updateCollegeName(Long id, String name);
    void deleteCollege(Long id);
}