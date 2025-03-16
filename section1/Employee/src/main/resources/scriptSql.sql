-- Create Employees Table
CREATE TABLE IF NOT EXISTS employees (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    mobile VARCHAR(15) UNIQUE NOT NULL,
    address VARCHAR(255) NOT NULL
);

-- Insert Sample Data
INSERT INTO employees (name, email, mobile, address) VALUES
('John Doe', 'john@example.com', '9876543210', 'New York, USA'),
('Jane Smith', 'jane@example.com', '9876543211', 'Los Angeles, USA'),
('Alice Johnson', 'alice@example.com', '9876543212', 'Chicago, USA'),
('Robert Brown', 'robert@example.com', '9876543213', 'Houston, USA'),
('Emily Davis', 'emily@example.com', '9876543214', 'San Francisco, USA'),
('Michael Wilson', 'michael@example.com', '9876543215', 'Seattle, USA'),
('Sophia Martinez', 'sophia@example.com', '9876543216', 'Boston, USA'),
('David Anderson', 'david@example.com', '9876543217', 'Denver, USA');
