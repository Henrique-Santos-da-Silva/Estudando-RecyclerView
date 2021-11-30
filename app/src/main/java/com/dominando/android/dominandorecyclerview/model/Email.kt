package com.dominando.android.dominandorecyclerview.model

data class Email(
        val user: String,
        val subject: String,
        val preview: String,
        val date: String,
        val stared: Boolean,
        val unread: Boolean,
        var selected: Boolean = false
)

class EmailBuilder {
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false

    fun build(): Email = Email(user, subject, preview, date, stared, unread, false)
}

fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()

fun fakeEmails(): MutableList<Email> = mutableListOf(
        email {
            user = "Facebook"
            subject = "Veja nossas três dicas principais para você se destacar no Facebook"
            preview = "Olá Fulano, você precisa ver esse site para"
            date = "26 jun"
            stared = false
        },

        email {
            user = "Linkedin"
            subject = "10 vagas novas para 'Desenvolvedor Android'"
            preview = "Visualizar vagas em: São Paulo, São Paulo..."
            date = "28 jun"
            stared = true
            unread = true
        },

        email {
            user = "Instagram"
            subject = "festhashs, veja o que está acontecendo"
            preview = "Maria Antonieta, Napoleão Bonaparte e outros"
            date = "28 jun"
            stared = true
            unread = true
        },

        email {
            user = "Youtube"
            subject = "FulanoGamePlay acabou de enviar um video"
            preview = "FulanoGamePlay enviou GTA San Andreas: Inicio #01"
            date = "29 jun"
            stared = false
        },

        email {
            user = "Facebook"
            subject = "Veja nossas três dicas principais para você se destacar no Facebook"
            preview = "Olá Fulano, você precisa ver esse site para"
            date = "26 jun"
            stared = false
        },

        email {
            user = "Linkedin"
            subject = "10 vagas novas para 'Desenvolvedor Android'"
            preview = "Visualizar vagas em: São Paulo, São Paulo..."
            date = "28 jun"
            stared = true
            unread = true
        },

        email {
            user = "Instagram"
            subject = "festhashs, veja o que está acontecendo"
            preview = "Maria Antonieta, Napoleão Bonaparte e outros"
            date = "28 jun"
            stared = true
            unread = true
        },

        email {
            user = "Youtube"
            subject = "FulanoGamePlay acabou de enviar um video"
            preview = "FulanoGamePlay enviou GTA San Andreas: Inicio #01"
            date = "29 jun"
            stared = false
        },

        email {
            user = "Facebook"
            subject = "Veja nossas três dicas principais para você se destacar no Facebook"
            preview = "Olá Fulano, você precisa ver esse site para"
            date = "26 jun"
            stared = false
        },

        email {
            user = "Linkedin"
            subject = "10 vagas novas para 'Desenvolvedor Android'"
            preview = "Visualizar vagas em: São Paulo, São Paulo..."
            date = "28 jun"
            stared = true
            unread = true
        },

        email {
            user = "Instagram"
            subject = "festhashs, veja o que está acontecendo"
            preview = "Maria Antonieta, Napoleão Bonaparte e outros"
            date = "28 jun"
            stared = true
            unread = true
        },

        email {
            user = "Youtube"
            subject = "FulanoGamePlay acabou de enviar um video"
            preview = "FulanoGamePlay enviou GTA San Andreas: Inicio #01"
            date = "29 jun"
            stared = false
        },
)