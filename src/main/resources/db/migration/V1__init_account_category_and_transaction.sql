
CREATE TABLE account_category (
                                  id INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
                                  name VARCHAR(50) NOT NULL COMMENT '카테고리 이름'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

CREATE TABLE transaction (
                             id BIGINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
                             account_category_id INT UNSIGNED NOT NULL,
                             amount DECIMAL(15,2) NOT NULL,
                             note VARCHAR(255),
                             trans_date DATE NOT NULL,
                             created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                             updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
                             CONSTRAINT fk_tx_category
                                 FOREIGN KEY (account_category_id)
                                     REFERENCES account_category(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
