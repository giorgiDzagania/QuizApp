package giorgidzagania.example.quizapp

object Constants {

    const val USER_NAME: String ="user_name"
    const val TOTAL_QUESTIONS: String ="total_question"
    const val CORRECT_ANSWERS: String ="correct_answers"

    fun getQuestion(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Armenia",
            "Austria",
            1
        )
        questionList.add(que1)

        val que2 = Question(
            2,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_australia,
            "Brazil",
            "New Zealand",
            "Australia",
            "Poland",
            3
        )
        questionList.add(que2)

        val que3 = Question(
            3,
            "What country does this flag belongs to?",
            R.drawable.ic_flag_of_belgium,
            "Monaco",
            "Georgia",
            "Fiji",
            "Belgium",
            4
        )
        questionList.add(que3)

        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Kosovo",
            "Portugal",
            "Turkey",
            "Brazil",
            4
        )
        questionList.add(que4)

        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark",
            "India",
            "Macedonia",
            "Kazakhstan",
            1
        )
        questionList.add(que5)

        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Liechtenstein",
            "San Marino",
            "Tunis",
            "Fiji",
            4
        )
        questionList.add(que6)

        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Macedonia",
            "Italy",
            "Germany",
            "France",
            3
        )
        questionList.add(que7)

        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India",
            "Georgia",
            "Turkey",
            "Kazakhstan",
            1
        )
        questionList.add(que8)

        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "North Korea",
            "Bhutan",
            "Kuwait",
            "Belarus",
            3
        )
        questionList.add(que9)

        val que10 = Question(
            10,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Austria",
            "Australia",
            "New Zealand",
            "Honduras",
            3
        )
        questionList.add(que10)


        return questionList
    }
}