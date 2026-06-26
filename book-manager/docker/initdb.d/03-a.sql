USE book_manager;

INSERT INTO book
VALUES(100, 'Kotlin入門', 'コトリン太郎', '1950-10-01'),
      (200, 'Java入門', 'ジャヴァ太郎', '2005-08-29');

INSERT INTO user
VALUES(1, 'admin@test.com', '$argon2id$v=19$m=19456,t=2,p=1$eHBZOTlEaGsrNWl4a2wwbw$Q7+4fSMLKgb2/iBW5rTvg2Y1koHP5isTI15wBg6B8JU
', '管理者', 'ADMIN'),
      (2, 'user@test.com', '$argon2id$v=19$m=19456,t=2,p=1$cVV3RG1BNlRkK2JoKytPRg$BNv5C20ZJHv9iihN3qhIdeK7StMDLlVSIbXcigsQUN4
', 'ゆーざー', 'USER')