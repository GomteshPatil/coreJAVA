package com.xworkz.inheritance;

import com.xworkz.inheritance.shop.CobraSnake;
import com.xworkz.inheritance.shop.Snake;

public class SnakeStarter {

	public static void main(String[] args) {

		CobraSnake cobraSnake = new CobraSnake();
		Snake snake = new CobraSnake();
		Object object = new CobraSnake();

		cobraSnake.hoodOrHede();
		cobraSnake = new CobraSnake(2);

		System.out.println(snake.breed);

		CobraSnake castedSnake = (CobraSnake) snake;
		castedSnake.hoodOrHede();

		((CobraSnake) snake).hoodOrHede();
		
		CobraSnake objectcasted=(CobraSnake)object;
		objectcasted.hoodOrHede();

	}

}
