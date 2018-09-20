fun transcribeToRna(dna: String): String {
    var rna = CharArray(dna.length)

    for ((index, nucleotide) in dna.withIndex()) {
        rna[index] = when (nucleotide) {
            'G' -> 'C'
            'C' -> 'G'
            'T' -> 'A'
            'A' -> 'U'
            else -> 'X' // oh noes!
        }
    }

    return rna.joinToString("")
}
