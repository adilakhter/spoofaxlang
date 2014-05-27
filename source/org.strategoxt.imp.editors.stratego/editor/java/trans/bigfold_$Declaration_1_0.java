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

@SuppressWarnings("all") public class bigfold_$Declaration_1_0 extends Strategy 
{ 
  public static bigfold_$Declaration_1_0 instance = new bigfold_$Declaration_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy k_4311)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_Declaration_1_0");
    Fail22116:
    { 
      IStrategoTerm h_4311 = null;
      IStrategoTerm l_4311 = null;
      IStrategoTerm n_4311 = null;
      h_4311 = term;
      n_4311 = term;
      Success11920:
      { 
        Fail22117:
        { 
          IStrategoTerm p_4311 = null;
          p_4311 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, p_4311, trans.const4360, h_4311);
          if(term == null)
            break Fail22117;
          if(true)
            break Success11920;
        }
        term = trans.constNil3;
      }
      l_4311 = term;
      term = n_4311;
      term = termFactory.makeTuple(l_4311, term);
      term = k_4311.invoke(context, term, lifted6768.instance);
      if(term == null)
        break Fail22116;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}