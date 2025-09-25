ALTER TABLE sets
  ADD COLUMN created_at timestamptz NOT NULL DEFAULT now();--set is now orderd by timestamp lol