package HandshakeCalculator

import Signal

fun calculateHandshake(n: Int): List<Signal> {
    val binary = n.toString(2)
    val handshake = mutableListOf<Signal>()

    for (indexedDigit in binary.reversed().withIndex()) {
        when (indexedDigit) {
            IndexedValue(0, '1') -> handshake.add(Signal.WINK)
            IndexedValue(1, '1') -> handshake.add(Signal.DOUBLE_BLINK)
            IndexedValue(2, '1') -> handshake.add(Signal.CLOSE_YOUR_EYES)
            IndexedValue(3, '1') -> handshake.add(Signal.JUMP)
        }
    }

    val shouldReverse = binary.length >= 5 && binary[4] == '1'

    return if (shouldReverse) { handshake.reversed() } else { handshake }
}