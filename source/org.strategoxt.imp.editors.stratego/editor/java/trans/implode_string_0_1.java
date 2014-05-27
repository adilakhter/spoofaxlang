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

@SuppressWarnings("all") public class implode_string_0_1 extends Strategy 
{ 
  public static implode_string_0_1 instance = new implode_string_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_4211)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("implode_string_0_1");
    Fail21534:
    { 
      IStrategoTerm u_4211 = null;
      u_4211 = term;
      term = s_4211;
      IStrategoTerm term11638 = term;
      Success11563:
      { 
        Fail21535:
        { 
          term = is_string_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21535;
          if(true)
            break Success11563;
        }
        term = term11638;
        term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3);
        term = implode_string_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail21534;
      }
      term = separate_by_0_1.instance.invoke(context, u_4211, term);
      if(term == null)
        break Fail21534;
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21534;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}