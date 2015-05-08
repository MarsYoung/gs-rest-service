package hello;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {

	@RequestMapping("/getResult")
	public Result getResult(
			@RequestParam(value = "success", defaultValue = "false") String success) {
		Result r = new Result();
		if (StringUtils.isEmpty(success) || success.equals("false")) {
			r.setStatus(404);
			r.getData().setStatus(404);
			return r;
		} else {
			return r;
		}

	}
}