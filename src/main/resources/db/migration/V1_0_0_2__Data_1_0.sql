INSERT INTO buku(id, judul, genre, jenis) VALUES 
('1','Max Havelar','ngasal','Novel');

INSERT INTO `c_security_role` (`id`, `name`, `description`) VALUES 
('admin', 'admin', 'Applicatipn Admin'),
('user', 'user', 'Applicatipn User');

INSERT INTO `c_security_permission` (`id`,`permission_label`,`permission_value`) VALUES
('buku_update','Edit Buku','ROLE_BUKU_UPDATE'),
('buku_view','View Buku','ROLE_BUKU_VIEW'),
('buku_create','Create Buku','ROLE_BUKU_CREATE'),
('buku_delete','Delete Buku','ROLE_BUKU_DELETE'),
('user_view','View User','ROLE_USER_VIEW');

INSERT INTO `c_security_role_permission` (`id_role`, `id_permission`) VALUES
('admin','buku_update'),
('admin','buku_view'),
('admin','buku_create'),
('admin','buku_delete'),
('user','buku_view'),
('user','user_view'),
('admin','user_view');

INSERT INTO `c_security_user` (`id`,`username`,`password`,`active`,`id_role`) VALUES
('1','sh','admin',true,'admin'),
('2','shsh','user',true,'user');

