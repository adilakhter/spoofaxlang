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

@SuppressWarnings("all") public class pp_stratego__sugar_string_0_0 extends Strategy 
{ 
  public static pp_stratego__sugar_string_0_0 instance = new pp_stratego__sugar_string_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("pp_stratego__sugar_string_0_0");
    Fail21431:
    { 
      IStrategoTerm r_4197 = null;
      IStrategoTerm s_4197 = null;
      IStrategoTerm x_4197 = null;
      r_4197 = term;
      s_4197 = trans.constStrategoSugarGeneratedPpAf;
      term = (IStrategoTerm)termFactory.makeListCons(s_4197, termFactory.makeListCons(trans.constStrategoSugarPpAf, (IStrategoList)trans.constNil3));
      term = ast2abox_0_1.instance.invoke(context, r_4197, term);
      if(term == null)
        break Fail21431;
      x_4197 = term;
      term = box2text_string_0_1.instance.invoke(context, x_4197, trans.const4326);
      if(term == null)
        break Fail21431;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}