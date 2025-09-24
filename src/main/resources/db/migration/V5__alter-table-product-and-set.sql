ALTER TABLE product ADD COLUMN distribution_center VARCHAR(50);

UPDATE product
SET distribution_center = CASE
    WHEN id IN ('p1','p2','p3') THEN 'Mogi das Cruzes'
    WHEN id IN ('p4','p5','p6') THEN 'Recife'
    WHEN id IN ('p7','p8','p9') THEN 'Porto Alegre'
END
WHERE id IN ('p1','p2','p3','p4','p5','p6','p7','p8','p9');
