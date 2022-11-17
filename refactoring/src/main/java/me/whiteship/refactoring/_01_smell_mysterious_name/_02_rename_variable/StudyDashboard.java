package me.whiteship.refactoring._01_smell_mysterious_name._02_rename_variable;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudyDashboard {

    private Set<String> usernames = new HashSet<>();

    private Set<String> reviews = new HashSet<>();

    /**
     * 스터디 리뷰 이슈에 작성되어 있는 리뷰어 목록과 리뷰를 읽어옵니다.
     * @throws IOException
     */
    private void loadReviews() throws IOException {
        GitHub gitHub = GitHub.connect();
        GHRepository repository = gitHub.getRepository("whiteship/live-study");
        GHIssue issue = repository.getIssue(30);

        //리뷰를 불러오는 메서드인데 리뷰 관련 이름이 아무것도 없다..?
        List<GHIssueComment> reviews = issue.getComments();
        for (GHIssueComment review : reviews) {
            usernames.add(review.getUserName());
            this.reviews.add(review.getBody());
        }
    }

    public Set<String> getUsernames() {
        return usernames;
    }

    public Set<String> getReviews() {
        return reviews;
    }

    public static void main(String[] args) throws IOException {
        StudyDashboard studyDashboard = new StudyDashboard();
        studyDashboard.loadReviews();

        //람다식 안의 변수 이름 할당 -> 간추려서 쓰기도 함 (왜? 어떤 변수인지 이미 알고 있기 때문에 !)
        studyDashboard.getUsernames().forEach(name -> System.out.println(name));
//        studyDashboard.getUsernames().forEach(System.out::println); >> 인텔리제이가 알아서 간편하게 바꿔줌. 이런 경우 변수 정의를 안해도 됨
        studyDashboard.getReviews().forEach(review -> System.out.println(review));
    }
}
