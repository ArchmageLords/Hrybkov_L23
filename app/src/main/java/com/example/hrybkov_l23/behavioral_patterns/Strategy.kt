package com.example.hrybkov_l23.behavioral_patterns

interface Strategy {
    fun execute(a: Double, b: Double): Double
}

class StrategyAdd : Strategy {
    override fun execute(a: Double, b: Double): Double {
        return a + b
    }
}

class StrategySubtract : Strategy {
    override fun execute(a: Double, b: Double): Double {
        return a - b
    }
}

class StrategyDivision : Strategy {
    override fun execute(a: Double, b: Double): Double {
        return a / b
    }
}

class StrategyMultiply : Strategy {
    override fun execute(a: Double, b: Double): Double {
        return a * b
    }
}

class Context() {
    private var strategy: Strategy? = null

    fun setStrategy(strategy: Strategy) {
        this.strategy = strategy
    }

    fun executeStrategy(a: Double, b: Double): Double? {
        return strategy?.execute(a, b)
    }
}

fun main() {
    val context = Context().apply { setStrategy(StrategyDivision()) }
    println(context.executeStrategy(5.27, 4.35))
}