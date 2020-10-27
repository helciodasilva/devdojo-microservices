package academy.devdojo.youtube.course.endpoint.repository;

import academy.devdojo.youtube.course.endpoint.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
