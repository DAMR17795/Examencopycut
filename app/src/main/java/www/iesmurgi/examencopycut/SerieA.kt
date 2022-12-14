package www.iesmurgi.examencopycut

data class SerieA(val equipo: String ){

    companion object {

        val serieA = arrayOf(
            SerieA("juventus"),
            SerieA("milan"),
            SerieA("napoli")
        )

    }

    override fun toString(): String {
        return equipo
    }


}
