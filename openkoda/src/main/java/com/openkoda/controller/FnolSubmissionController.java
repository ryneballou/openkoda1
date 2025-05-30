package com.openkoda.api;

import com.openkoda.model.FnolSubmission;
import com.openkoda.repository.FnolSubmissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/fnol")
public class FnolSubmissionController {

    @Autowired
    private FnolSubmissionRepository repository;

    @PostMapping
    public FnolSubmission submitFnol(@RequestBody FnolSubmission data) {
        return repository.save(data);
    }
}
