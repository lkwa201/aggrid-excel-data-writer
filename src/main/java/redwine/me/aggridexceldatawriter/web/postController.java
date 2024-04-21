package redwine.me.aggridexceldatawriter.web;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redwine.me.aggridexceldatawriter.domain.BookService;
import redwine.me.aggridexceldatawriter.domain.PostDataRequest;

import java.util.List;

@Slf4j

@RequiredArgsConstructor
@RequestMapping("/api/v1/ag-grid")
@RestController
public class postController {

	private final BookService bookService;

	@PostMapping(value = "/data-write", produces = "application/json")
	public void dataWrite(@RequestBody List<PostDataRequest> request) {
		bookService.save(request);
	}
}
