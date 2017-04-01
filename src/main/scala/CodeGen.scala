object CodeGen extends App{
  slick.codegen.SourceCodeGenerator.main(
    Array(
      "slick.jdbc.PostgresProfile",
      "org.postgresql.Driver",
      "jdbc:postgresql://127.0.0.1:5432/mme_commerce",
      "/tmp/mme",
      "com.jeff",
      "postgres",
      "111111"
    )
  )
}
