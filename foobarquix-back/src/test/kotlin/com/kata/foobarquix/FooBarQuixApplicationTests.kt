package com.kata.foobarquix

import com.kata.foobarquix.services.FooBarQuixService
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FooBarQuixApplicationTests {

	@Autowired
	lateinit var fooBarQuixService: FooBarQuixService

	@Test
	fun contextLoads() {
	}
	@Test
	fun the_converted_number_should_be_1() {
		val convertedNumber = "1"
		Assertions.assertThat(fooBarQuixService.convertNumber(1)).isEqualTo(convertedNumber)
	}
	@Test
	fun the_converted_number_should_be_FooFoo() {
		val convertedNumber = "FooFoo"
		Assertions.assertThat(fooBarQuixService.convertNumber(3)).isEqualTo(convertedNumber)
	}
	@Test
	fun the_converted_number_should_be_BarBar() {
		val convertedNumber = "BarBar"
		Assertions.assertThat(fooBarQuixService.convertNumber(5)).isEqualTo(convertedNumber)
	}

	@Test
	fun the_converted_number_should_be_Quix() {
		val convertedNumber = "Quix"
		Assertions.assertThat(fooBarQuixService.convertNumber(7)).isEqualTo(convertedNumber)
	}

	@Test
	fun the_converted_number_should_be_Foo() {
		val convertedNumber = "Foo"
		Assertions.assertThat(fooBarQuixService.convertNumber(9)).isEqualTo(convertedNumber)
	}

	@Test
	fun the_converted_number_should_be_FooBar() {
		val convertedNumber = "FooBar"
		Assertions.assertThat(fooBarQuixService.convertNumber(51)).isEqualTo(convertedNumber)
	}

	@Test
	fun the_converted_number_should_be_BarFoo() {
		val convertedNumber = "BarFoo"
		Assertions.assertThat(fooBarQuixService.convertNumber(53)).isEqualTo(convertedNumber)
	}

	@Test
	fun the_converted_number_should_be_FooFooFoo() {
		val convertedNumber = "FooFooFoo"
		Assertions.assertThat(fooBarQuixService.convertNumber(33)).isEqualTo(convertedNumber)
	}

	@Test
	fun the_converted_number_should_be_FooQuix() {
		val convertedNumber = "FooQuix"
		Assertions.assertThat(fooBarQuixService.convertNumber(27)).isEqualTo(convertedNumber)
	}

	@Test
	fun the_converted_number_should_be_FooBarBar() {
		val convertedNumber = "FooBarBar"
		Assertions.assertThat(fooBarQuixService.convertNumber(15)).isEqualTo(convertedNumber)
	}

}
