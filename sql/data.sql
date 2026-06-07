USE week9_security;

INSERT INTO sys_user(username, password, role, enabled) VALUES
('admin', '$2a$10$7Lxd3iHvhIH6tNNmHfhwFeL6lQ8AO1ccLdW80iOP0cpmsxET51qlW', 'ADMIN', 1),
('user', '$2a$10$7Lxd3iHvhIH6tNNmHfhwFeL6lQ8AO1ccLdW80iOP0cpmsxET51qlW', 'USER', 1);

-- 测试账号：admin/123456，user/123456
