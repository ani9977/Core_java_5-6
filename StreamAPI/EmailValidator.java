package in.co.StreamAPI;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Arrays;
//import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class EmailValidator {
	public static void main(String[] args) {
		List<Task> t = new ArrayList<>();
		t.add(new Task("aniketsirota64@gmail.com"));
		t.add(new Task("vishalprajapat77@gmal.com"));
		t.add(new Task("vishalprajapat@gmailcom"));
		t.add(new Task("vishalprajapatgmail"));
		t.add(new Task("vishalprajapatgmail.com"));
		t.add(new Task("vishalprajapat@gmail.com")); // This one should be filtered out

		String gmailPattern = "^[A-Za-z0-9+_.-]+@gmail\\.com$";
		Pattern pattern = Pattern.compile(gmailPattern);

		t.stream().map(e -> e.email)
				.filter(e -> pattern.matcher(e).matches() && e.substring(0, e.indexOf('@')).matches(".*\\d.*"))
				.distinct().collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).forEach(e -> {
					System.out.println("Valid gmail is : " + e);
				});
	}
}
