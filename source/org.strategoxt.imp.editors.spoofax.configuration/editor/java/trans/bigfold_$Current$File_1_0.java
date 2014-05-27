package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigfold_$Current$File_1_0 extends Strategy 
{ 
  public static bigfold_$Current$File_1_0 instance = new bigfold_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy v_4638)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_CurrentFile_1_0");
    Fail22985:
    { 
      IStrategoTerm w_4638 = null;
      IStrategoTerm y_4638 = null;
      y_4638 = term;
      Success12217:
      { 
        Fail22986:
        { 
          IStrategoTerm z_4638 = null;
          IStrategoTerm b_4639 = null;
          IStrategoTerm c_4639 = null;
          b_4639 = term;
          z_4638 = trans.const4485;
          c_4639 = b_4639;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, c_4639, z_4638, trans.constCons2047);
          if(term == null)
            break Fail22986;
          if(true)
            break Success12217;
        }
        term = trans.constNil4;
      }
      w_4638 = term;
      term = y_4638;
      term = termFactory.makeTuple(w_4638, term);
      term = v_4638.invoke(context, term, lifted6894.instance);
      if(term == null)
        break Fail22985;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}