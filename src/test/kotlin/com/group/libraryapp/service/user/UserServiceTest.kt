package com.group.libraryapp.service.user

import com.group.libraryapp.domain.user.UserRepository
import com.group.libraryapp.dto.user.request.UserCreateRequest
import org.assertj.core.api.AssertionsForInterfaceTypes.assertThat
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.junit.jupiter.api.Test

@SpringBootTest
class UserServiceTest @Autowired constructor (
    @Autowired private val userRepository: UserRepository,
    @Autowired private val userService: UserService,
)
{

    @Test
    fun saveUserTest() {
    // given
    val request = UserCreateRequest("최태현", null)

    // when
    userService.saveUser(request)

    // then
    val results = userRepository.findAll()
    assertThat(results).hasSize(1)
    }

}