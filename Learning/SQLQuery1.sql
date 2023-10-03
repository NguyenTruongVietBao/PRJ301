INSERT INTO dbo.tblUsers VALUES (   N'S123', N'bao', N'123', N'bao', 1  )
INSERT INTO dbo.tblUsers VALUES (   N'S124', N'bao', N'123', N'bao', 1  )
INSERT INTO dbo.tblUsers VALUES (   N'S125', N'bao', N'123', N'bao', 1  )
INSERT INTO dbo.tblUsers VALUES (   N'S126', N'bao', N'123', N'bao', 1  )
INSERT INTO dbo.tblUsers VALUES (   N'S127', N'bao', N'123', N'bao', 1  )


SELECT * FROM dbo.tblUsers

SELECT * FROM dbo.tblUsers u  WHERE u.fullName LIKE '%HA%'

DELETE FROM dbo.tblUsers WHERE userID='S123'

UPDATE dbo.tblUsers SET fullName = '2', password = '2', roleID = '2', status=1  WHERE userID ='1'

SELECT * FROM dbo.tblUsers WHERE  userID= 'admin' AND password = '1'