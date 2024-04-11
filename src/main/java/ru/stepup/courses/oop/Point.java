/*
#1.Создайте класс Точка, расположенную на двумерной плоскости, которая описывается:

Координата Х: число
Координата Y: число
При создании требует указать обе координаты
Может возвращать текстовое представление вида “{X;Y}”
Далее необходимо создать три объекта точки: {1;3} {1;3} {5;8}

Выведите на экран текстовое представление этих точек и результат сравнения точек между собой. Убедитесь, что оба сравнения дали false.
 */

package ru.stepup.courses.oop;

public class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "{" + x + ";" + y + "}";
    }
}