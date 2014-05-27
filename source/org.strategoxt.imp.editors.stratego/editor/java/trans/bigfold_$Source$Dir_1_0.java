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

@SuppressWarnings("all") public class bigfold_$Source$Dir_1_0 extends Strategy 
{ 
  public static bigfold_$Source$Dir_1_0 instance = new bigfold_$Source$Dir_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4842)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_SourceDir_1_0");
    Fail23462:
    { 
      IStrategoTerm s_4842 = null;
      IStrategoTerm u_4842 = null;
      u_4842 = term;
      Success12594:
      { 
        Fail23463:
        { 
          IStrategoTerm v_4842 = null;
          IStrategoTerm x_4842 = null;
          IStrategoTerm y_4842 = null;
          x_4842 = term;
          v_4842 = trans.const4552;
          y_4842 = x_4842;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, y_4842, v_4842, trans.constCons2047);
          if(term == null)
            break Fail23463;
          if(true)
            break Success12594;
        }
        term = trans.constNil4;
      }
      s_4842 = term;
      term = u_4842;
      term = termFactory.makeTuple(s_4842, term);
      term = r_4842.invoke(context, term, lifted6994.instance);
      if(term == null)
        break Fail23462;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}