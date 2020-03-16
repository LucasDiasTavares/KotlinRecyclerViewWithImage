package br.com.lucasdiastavares.recylerview.Model

class DataSource {

    companion object{

        fun createDataSet(): ArrayList<Post>{
            val list = ArrayList<Post>()
            list.add(
                    Post(
                            1,
                            "Congratulations!",
                            "You made it to the end of the course!\r\n\r\nNext we'll be building the REST API!",
                            "https://raw.githubusercontent.com/mitchtabian/Blog-Images/master/digital_ocean.png",
                            "Sally"
                    )
            )
            list.add(
                    Post(
                            2,
                            "Time to Build a Kotlin App!",
                            "The REST API course is complete. You can find the videos here: https://codingwithmitch.com/courses/build-a-rest-api/.",
                            "https://cdn.pixabay.com/photo/2016/03/04/22/54/panda-1236875_960_720.jpg",
                            "mitch"
                    )
            )

            list.add(
                    Post(
                            3,
                            "Interviewing a Web Developer and YouTuber",
                            "Justin has been producing online courses for YouTube, Udemy, and his website CodingForEntrepreneurs.com for over 5 years.",
                            "https://cdn.pixabay.com/photo/2019/08/21/16/03/panda-4421395_960_720.jpg",
                            "John"
                    )
            )
            list.add(
                    Post(
                            4,
                            "Freelance Android Developer",
                            "Freelance android developer for several years. He also has some of the best android development courses I've had the pleasure of taking on Udemy.com.",
                            "https://cdn.pixabay.com/photo/2017/07/24/19/57/tiger-2535888_960_720.jpg",
                            "Steven"
                    )
            )
            list.add(
                    Post(
                            5,
                            "Freelance Android Developer, Donn Felker",
                            "Freelancing as an Android developer with Donn Felker.\\r\\n\\r\\nDonn is also:\\r\\n\\r\\n1) Founder of caster.io\\r\\n\\r\\n2) Co-host of the fragmented podcast (fragmentedpodcast.com).",
                            "https://cdn.pixabay.com/photo/2017/05/31/18/38/sea-2361247_960_720.jpg",
                            "Richelle"
                    )
            )
            list.add(
                    Post(
                            6,
                            "Work Life Balance for Software Developers",
                            "What kind of hobbies do software developers have? It sounds like many software developers don't have a lot of hobbies and choose to focus on work. Is that a good idea?",
                            "https://cdn.pixabay.com/photo/2017/01/14/12/59/iceland-1979445_960_720.jpg",
                            "Jessica"
                    )
            )
            list.add(
                    Post(
                            7,
                            "Full Stack Web Developer - Nicholas Olsen",
                            "In this podcast I interviewed the Fullsnack Developer (AKA Nicholas Olsen).\\r\\n\\r\\nNicholas is many things. What I mean by that is, he's good at many things.\\r\\n\\r\\n1. He’s an entrepreneur\\r\\n\\r\\n2. Web developer\\r\\n\\r\\n3. Artist\\r\\n\\r\\n4. Graphic designer\\r\\n\\r\\n5. Musician (drums)\\r\\n\\r\\n6. Professional BodyBuilder.",
                            "https://cdn.pixabay.com/photo/2016/03/04/22/54/panda-1236875_960_720.jpg",
                            "Guy"
                    )
            )
            list.add(
                    Post(
                            8,
                            "Javascript Expert - Wes Bos",
                            "Interviewing a web developer, javascript expert, entrepreneur, freelancer, podcaster, and much more.",
                            "https://cdn.pixabay.com/photo/2019/08/21/16/03/panda-4421395_960_720.jpg",
                            "Ruby"
                    )
            )
            list.add(
                    Post(
                            9,
                            "Senior Android Engineer - Kaushik Gopal",
                            "Kaushik Gopal is a Senior Android Engineer working in Silicon Valley.\r\n\r\nHe works as a Senior Staff engineer at Instacart.\r\n\r\nInstacart: https://www.instacart.com/",
                            "https://cdn.pixabay.com/photo/2017/07/24/19/57/tiger-2535888_960_720.jpg",
                            "mitch"
                    )
            )
            return list
        }
    }

}