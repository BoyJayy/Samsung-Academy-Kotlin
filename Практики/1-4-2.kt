fun moveRobot(r: Robot, toX: Int, toY: Int) {
    if (toX >= r.x && toY >= r.y) {
        if (r.direction == Direction.DOWN) {
            r.turnLeft()
        }
        if (r.direction == Direction.LEFT) {
            r.turnLeft()
            r.turnLeft()
        }
        if (r.direction == Direction.UP) {
            r.turnRight()
        }
        for (i in r.x..toX - 1) {
            r.stepForward()
        }
        r.turnLeft()
        for (i in r.y..toY -1) {
            r.stepForward()
        }
    }
    if (toX < r.x && toY < r.y) {
        if (r.direction == Direction.RIGHT) {
            r.turnLeft()
            r.turnLeft()
        }
        if (r.direction == Direction.DOWN) {
            r.turnRight()
        }
        if (r.direction == Direction.UP) {
            r.turnLeft()
        }
        for (i in toX..r.x - 1) {
            r.stepForward()
        }
        r.turnLeft()
        for (i in toY..r.y - 1) {
            r.stepForward()
        }
    }
    if (toX >= r.x && toY < r.y) {
        if (r.direction == Direction.DOWN) {
            r.turnLeft()
        }
        if (r.direction == Direction.LEFT) {
            r.turnLeft()
            r.turnLeft()
        }
        if (r.direction == Direction.UP) {
            r.turnRight()
        }
        for (i in r.x..toX - 1) {
            r.stepForward()
        }
        r.turnRight()
        for (i in toY..r.y - 1) {
            r.stepForward()
        }
    }
    if (toX < r.x && toY >= r.y) {
        if (r.direction == Direction.RIGHT) {
            r.turnLeft()
            r.turnLeft()
        }
        if (r.direction == Direction.DOWN) {
            r.turnRight()
        }
        if (r.direction == Direction.UP) {
            r.turnLeft()
        }
        for (i in toX..r.x - 1) {
            r.stepForward()
        }
        r.turnRight()
        for (i in r.y..toY - 1) {
            r.stepForward()
        }
    }
}
