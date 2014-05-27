package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class rule_to_lambda_rule_0_0 extends Strategy 
{ 
  public static rule_to_lambda_rule_0_0 instance = new rule_to_lambda_rule_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail21310:
    { 
      IStrategoTerm y_4172 = null;
      y_4172 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consRule_3 != ((IStrategoAppl)term).getConstructor())
        break Fail21310;
      term = termFactory.makeAppl(Main._consLRule_1, new IStrategoTerm[]{y_4172});
      if(true)
        return term;
    }
    context.push("rule_to_lambda_rule_0_0");
    context.popOnFailure();
    return null;
  }
}