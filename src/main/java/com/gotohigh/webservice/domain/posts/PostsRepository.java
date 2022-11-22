package com.gotohigh.webservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/*

* ibatis or MyBatis -> DAO
* JPA               -> Repository
*
* */
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
