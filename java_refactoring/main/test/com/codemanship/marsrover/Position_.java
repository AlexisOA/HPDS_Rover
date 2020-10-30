package com.codemanship.marsrover;

import org.junit.Test;
import refactoring.Rover;
import refactoring.Rover.Position;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static refactoring.Rover.Heading.*;

public class Position_ {

	@Test
	public void should_calculate_forward_position() {
		assertThat(new Position(0,0).forward(North)).isEqualTo(new Position(0,1));
		assertThat(new Position(0,0).forward(South)).isEqualTo(new Position(0,-1));
		assertThat(new Position(0,0).forward(East)).isEqualTo(new Position(1,0));
		assertThat(new Position(0,0).forward(North).forward(West).forward(South)).isEqualTo(new Position(-1,0));

	}

	@Test
	public void should_calculate_backward_position() {
		assertThat(new Position(0,0).backward(North)).isEqualTo(new Position(0,-1));
		assertThat(new Position(0,0).backward(South)). isEqualTo(new Position(0,1));
		assertThat(new Position(0,0).backward(East)).isEqualTo(new Position(-1,0));
		assertThat(new Position(0,0).backward(North).backward(West).backward(South)).isEqualTo(new Position(1,0));
	}
}
