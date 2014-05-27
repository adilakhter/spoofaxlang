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

@SuppressWarnings("all") public class bigchain_$Is$Imported_0_0 extends Strategy 
{ 
  public static bigchain_$Is$Imported_0_0 instance = new bigchain_$Is$Imported_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigchain_IsImported_0_0");
    Fail21964:
    { 
      IStrategoTerm t_4285 = null;
      IStrategoTerm w_4285 = null;
      IStrategoTerm y_4285 = null;
      t_4285 = term;
      y_4285 = term;
      Success11880:
      { 
        Fail21965:
        { 
          IStrategoTerm a_4286 = null;
          a_4286 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, a_4286, trans.const4327, t_4285);
          if(term == null)
            break Fail21965;
          if(true)
            break Success11880;
        }
        term = trans.constNil3;
      }
      w_4285 = term;
      term = y_4285;
      term = termFactory.makeTuple(w_4285, term);
      term = foldl_1_0.instance.invoke(context, term, lifted6716.instance);
      if(term == null)
        break Fail21964;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}