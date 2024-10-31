package com.english.pdf



object Config {
// IDE Enviroment
// Wait 5 second after build to kill the suspended process
 const val KILL_PROCESS_DURATION: Long = 5000

    // Api Scope
    object ApiConfig {
        const val AUTH_API_PATH = "tra-ext-auth/"
        const val SERVICES_API_PATH = "tra-extapp-api/"
        const val TRANSITIONS_API_PATH = "tra-translation-api/"
        const val SOCKET_PATH = "/tra-realtime-api/socket.io/"
        const val TELECOM_API_PATH = "tra-integration-telecom/"

        enum class Environment {
            DEV,
            STG,
            QA,
            PROD
        }
        /*
        DEV
        telecom service
        "key": "Y5YWKCH-GQCMA70-PYRB7KA-ZSHRHWE",
        "appId": "f17dc9b2-85d9-451c-b7b0-b3cdfe6388f1",
        ext app service
        "key": "65TDZBC-VTYMRRK-GE9JWX1-DYSA761",
        "appId": "3174dfad-debd-4c62-8393-2e746fb2a398"
        translitions
        "key": "QS83C4E-2R8MJN1-PTG80MY-X9BE08D",
        "appId": "be503611-1611-4954-b6a0-8053ea56e021",
         */


        /*
        QA:
       QA api keys
       ext app service
        "key": "R84CGBA-2SX4929-KXBMJQQ-EMZT2ES",
        "appId": "c208c82d-167a-4489-9f57-495e753fa13b",
        telecom
        "key": "Q7YCDB1-TT24NRD-QY94QX2-VDH29Y9",
        "appId": "b9fcc6ac-d684-4ae1-bf92-4bf4db6224f9"
        transilition
        "key": "85WNN8T-Q0CMZX7-K61H5HY-ZP2QYKF",
        "appId": "41795aa3-b819-4ff4-9983-12c7fd857f4d",
         */



        /*
        PROD:
        TELECOM SERVICE
        APP_ID        a842561f-49c4-4275-9b84-4d02d172660c
        API_KEY        08HME8G-WKA4E1N-J2QA6X7-ZEDKD8C
        TRANSLATION
        APP_ID        8c9264a6-54f5-4a45-a152-bdaf464b7875
        API_KEY        RSBQ6TB-76S4195-H4TR55J-KK61N5J
        SERVICE
        APP_ID        85030cfc-daee-4e0d-8d77-049116950503
        API_KEY        98Z63PG-XFKMB4E-JB4EK74-30P59R1
        SOCKET
        APP_ID        aca266b7-dfbb-45ad-9a46-e3baa3e9c62a
        API_KEY        AYGF4GE-S9F48N0-G8SFE4B-G79B9MZ
        */


        private val apiKeys = mapOf(
            Environment.DEV to mapOf(
                SERVICES_API_PATH to "\"bd50a4de92a66d6e8074d72a8709bc14aa3926336c8e7963cc7ec0cf3e2eab37136e4e5c253ad7aca6a65b6f1d0116\"", //65TDZBC-VTYMRRK-GE9JWX1-DYSA761
                TELECOM_API_PATH to "\"d250a9cd83a7666e9171cd2a946cc714bd254d3b0c9d0963d274dbdc414fdf629f05f1a6da5ee489deeb4207ff5672\"", //Y5YWKCH-GQCMA70-PYRB7KA-ZSHRHWE
                TRANSITIONS_API_PATH to "\"da36c8a98bd06b6ee472b62a9f15c614bd2858410b9b1163d01ed1cb3920de1e237ed3ca3611215e279b2783a512ec\"" //QS83C4E-2R8MJN1-PTG80MY-X9BE08D
                ),
            Environment.STG to mapOf(
                SERVICES_API_PATH to "\"bd50a4de92a66d6e8074d72a8709bc14aa3926336c8e7963cc7ec0cf3e2eab37136e4e5c253ad7aca6a65b6f1d0116\"",
                TELECOM_API_PATH to "\"d250a9cd83a7666e9171cd2a946cc714bd254d3b0c9d0963d274dbdc414fdf629f05f1a6da5ee489deeb4207ff5672\"",
                TRANSITIONS_API_PATH to "\"da36c8a98bd06b6ee472b62a9f15c614bd2858410b9b1163d01ed1cb3920de1e237ed3ca3611215e279b2783a512ec\""
            ),
            Environment.QA to mapOf(
                SERVICES_API_PATH to "\"d95dc4d98fa66f6ee473d653ec69ce14a6245d3471871963cd6ac9da3b5dc9da5e3ee2eafcdc6d25f496099a96e1d2\"", //R84CGBA-2SX4929-KXBMJQQ-EMZT2ES
                TELECOM_API_PATH to "\"da52a9d98ca61f6e8274bc539b09b314bc25264d6a8e7a63de63dbbc3041a3b664b5829398c7d86907c9ed3a698fcc\"", //Q7YCDB1-TT24NRD-QY94QX2-VDH29Y9
                TRANSITIONS_API_PATH to "\"b350a7d486dc7a6e8710cd2a8f03c014a64a2e310e9e1163d277a1df5053dc734c2b9470c962b341590a56e209cd49\"" //85WNN8T-Q0CMZX7-K61H5HY-ZP2QYKF
            ),
            Environment.PROD to mapOf(
                SERVICES_API_PATH to "\"b25daaacfbb4696e8e66c52a976fb214a73e2b3c70e17c63bb17c3bb304aab393470e18755482b5a9ecddd369c3a61\"", //PG1HSQQ-M094MGX-MK8NX86-95064NA
                TELECOM_API_PATH to "\"bb5db8d78ddc696e816bcf53906ab914a74e4e380d8e7f63d262d7c54d20d9ebf4ec07823981016d8163bff74bbe72\"", //PG1HSQQ-M094MGX-MK8NX86-95064NA
                TRANSITIONS_API_PATH to "\"d936b2cbfeb06c6ee116dd53e462c214a5484b2b0ee30263c36ca5bf472dd0999c005a234efdb52b6ca4c333180a7f\"" //PG1HSQQ-M094MGX-MK8NX86-95064NA
            )
        )

        private val appIds = mapOf(
            Environment.DEV to mapOf(
                SERVICES_API_PATH to "\"b854c7aeac824f27fb44eb05b176c35adb4e324108ef7b63ba42a4ba3f7ef86930e8d455fa7a4d091d6c4ed0c840db7c5c9cd763\"", //3174dfad-debd-4c62-8393-2e746fb2a398
                TELECOM_API_PATH to "\"ed54c7feabdd4c71fb18bb03ec76c30cdc1f321b0cb47863ea14f0ea6f7dac6869e38b5c715b8ffa196904374c2c4882ceb555ea\"", //f17dc9b2-85d9-451c-b7b0-b3cdfe6388f1
                TRANSITIONS_API_PATH to "\"e900c5aafbd21f72fb11b856e476c300d848321b0db77863b017a6bd6c79af6d34ebdf5c171dd434966f6009f1dfc7222b861766\"", //be503611-1611-4954-b6a0-8053ea56e021

                ),
            Environment.STG to mapOf(
                SERVICES_API_PATH to "\"b854c7aeac824f27fb44eb05b176c35adb4e324108ef7b63ba42a4ba3f7ef86930e8d455fa7a4d091d6c4ed0c840db7c5c9cd763\"",
                TELECOM_API_PATH to "\"ed54c7feabdd4c71fb18bb03ec76c30cdc1f321b0cb47863ea14f0ea6f7dac6869e38b5c715b8ffa196904374c2c4882ceb555ea\"",
                TRANSITIONS_API_PATH to "\"e900c5aafbd21f72fb11b856e476c300d848321b0db77863b017a6bd6c79af6d34ebdf5c171dd434966f6009f1dfc7222b861766\"",
                ),
            Environment.QA to mapOf(
                SERVICES_API_PATH to "\"e857c0a2abdc1c27fb11b850b476c30dd54532405de37f63bc1ea6eb3e2da93d30eade0ff1193848f2a439f4c33144da0982dba0\"",
                TELECOM_API_PATH to "\"e95c96f9abd24f20fb44b85fe176c358884d321b5def7a63bc45f5ba6d7aac6963ef8b546f104cd82839608db643539a86af8984\"",
                TRANSITIONS_API_PATH to "\"be51c0aff1d04b7afb42be5eb176c3008e1932405fe67b63bc1ef5ef3c20af6a37bedb099fef0766b55f83a80738820c1087e895\"",
                ),
            Environment.PROD to mapOf(
                SERVICES_API_PATH to "\"b350c0a9f8874820fb44ef02b076c35cdd1832415fe17f63b813aabf382ea36e61eedd5ef208dcffee4f9635023a9b32e9995f66\"",
                TELECOM_API_PATH to "\"ea5dc4a8fdd21f25fb14b704e176c30bda49324059ee7c63bc43a3bc6d29ad6967eddd0e17750d354dc4b47fd867bb7901944a6e\"",
                TRANSITIONS_API_PATH to "\"b306c9a8fed04f75fb15ba01e076c358d94932180ae37a63ea43f2e83d2eae3966e3da58eaaac95f1b222dca9a4a8201905e0fb4\"",
                )
        )

        val environments = mapOf(
            Environment.DEV to "https://api-dev.services.tdra.gov.ae/",
            Environment.STG to "https://api-stg.services.tdra.gov.ae/",
            Environment.QA to "https://api-qa.services.tdra.gov.ae/",
            Environment.PROD to "https://api.services.tdra.gov.ae/"
        )

        fun getAuthBaseURL(enviroment: Environment) = "\"${environments[enviroment]}$AUTH_API_PATH\""
        fun getServicesBaseURL(enviroment: Environment) = "\"${environments[enviroment]}$SERVICES_API_PATH\""
        fun getTransilitionsBaseURL(enviroment: Environment) = "\"${environments[enviroment]}$TRANSITIONS_API_PATH\""
        fun getTelecomBaseURL(enviroment: Environment) = "\"${environments[enviroment]}$TELECOM_API_PATH\""
        fun getApiKey(enviroment: Environment) = apiKeys[enviroment]
        fun getAppId(enviroment: Environment) = appIds[enviroment]
    }
    //App Scope
    object AppConfig {
        const val APPLICATION_ID = "biz.enon.tra.uae"
        const val MIN_SDK_VERSION = 28
        const val COMPILE_SDK_VERSION = 35
        const val BUILD_TOOLS_VERSION = "35.0.0"
        const val MAX_SDK_VERSION = 34
        const val TARGET_SDK_VERSION = 35
        const val VERSION_CODE = 600184
        const val MULTIDEX_ENABLED = true

        const val VERSION_NAME = "10.1.8"
        const val SUPPORT_INTERNAL_USER = false

        const val SECURE_PREF_VERSION = "\"1\""

        // Siren SDK Url
        const val STAGE_SIREN_JSON_DOCUMENT_URL =
            """"https://extapp-dev.services.tra.gov.ae/api/release/latest""""

        // database passwords
        const val APP_DATABASE_KEY =
            "\"fe0495ceba857e22a553fe0fa73a845c084cda07eb05bec6c8c483a0a6a097a7\""
        const val INTERNAL_DATABASE_KEY =
            "\"fe0495ceac964f0ab854eb15bb3a9b6c9e196d295aa53b3ee055f2fd6c265005381aa93810bce769594c7f43f7\""
        const val TRANSLATION_DATABASE_KEY =
            "\"fe0495ceba857a31b74efd0bb42f9e56830f4f1848a53826fa46e0eb7279d70b8c31b50954be871d5b1bcb0e\""


        // for uae-pass scheme
        const val URI_SCHEME = "\"trauae\""
        const val URI_HOST_SUCCESS = "\"success\""
        const val URI_HOST_FAILURE = "\"failure\""

        // for uae pass call back
        const val UAE_PASS_SUCCESS_CALL_BACK_URL = "\"trauae://success\""
        const val UAE_PASS_FAILURE_CALL_BACK_URL = "\"trauae://failure\""


        // Customer Pulse SDK
        const val CUSTOMER_PULSE_APP_ID = "\"gov.ae.tdra\""
        const val CUSTOMER_PULSE_GENERAL_SURVEY_LINK = "\"F/AD/\""


        // Environment/Variant Scope

    }
}
