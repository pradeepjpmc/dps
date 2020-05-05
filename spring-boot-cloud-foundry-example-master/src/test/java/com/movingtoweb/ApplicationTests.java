//package com.movingtoweb;
//
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Arrays;
//import java.util.List;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@RunWith(SpringRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//public class ApplicationTests {
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Test
//    public void testApplicationYml() {
//        String body = this.restTemplate.getForObject("/helloworld", String.class);
//        assertThat(body).isEqualTo("Welcome to all by Pradeep Gupta");
//    }
//
//    @Test
//    public void testApplicationProperties() {
//        String body = this.restTemplate.getForObject("/helloworld/name", String.class);
//        assertThat(body).isEqualTo("Spring Boot Testing");
//    }
//
////    @Test
////    public void testUsers() {
////        Users users = new Users();
////        users.setId(1L);
////        users.setName("Pradeep");
////        users.setTeamName("Development");
////        users.setSalary(100);
////        restTemplate.postForObject("/users/load", users, List.class);
////
////        List<Users> body = this.restTemplate.getForObject("/users", List.class);
////        assertThat(body.toString()).isEqualTo("[{id=1, name=Pradeep, teamName=Development, salary=100}]");
////
////        body = this.restTemplate.getForObject("/users/name/Pradeep", List.class);
////        assertThat(body.toString()).isEqualTo("[{id=1, name=Pradeep, teamName=Development, salary=100}]");
////    }
//
//}
