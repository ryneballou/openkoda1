package com.openkoda.repository;

import com.openkoda.model.FnolSubmission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FnolSubmissionRepository extends CrudRepository<FnolSubmission, Long> {
}
