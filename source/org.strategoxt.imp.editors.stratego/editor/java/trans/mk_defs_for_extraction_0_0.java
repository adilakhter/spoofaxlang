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

@SuppressWarnings("all") public class mk_defs_for_extraction_0_0 extends Strategy 
{ 
  public static mk_defs_for_extraction_0_0 instance = new mk_defs_for_extraction_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("mk_defs_for_extraction_0_0");
    Fail21267:
    { 
      IStrategoTerm term11434 = term;
      Success11433:
      { 
        Fail21268:
        { 
          term = mk_defs_for_selection_in_chain_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21268;
          if(true)
            break Success11433;
        }
        term = mk_defs_for_selection_0_0.instance.invoke(context, term11434);
        if(term == null)
          break Fail21267;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}