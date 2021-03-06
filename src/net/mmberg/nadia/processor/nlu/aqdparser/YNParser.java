package net.mmberg.nadia.processor.nlu.aqdparser;


public class YNParser extends Parser{

	public YNParser() {
		super("decision");
	}

	@Override
	public ParseResults parse(String utterance) {
		
		ParseResults results = new ParseResults(utterance);
		
		super.match_regex(results,"yes", this.type, "YES");
		super.match_regex(results,"yep", this.type, "YES");
		super.match_regex(results,"definitely", this.type, "YES");
		super.match_regex(results,"no", this.type, "NO");
		super.match_regex(results,"nope", this.type, "NO");
	
		return results;
	}

}
