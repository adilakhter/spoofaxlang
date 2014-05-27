package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class fold_$Declaration$File_1_0 extends Strategy 
{ 
  public static fold_$Declaration$File_1_0 instance = new fold_$Declaration$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy y_92099)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_DeclarationFile_1_0");
    Fail76253:
    { 
      IStrategoTerm v_92099 = null;
      IStrategoTerm z_92099 = null;
      IStrategoTerm b_92100 = null;
      v_92099 = term;
      b_92100 = term;
      Success41842:
      { 
        Fail76254:
        { 
          IStrategoTerm d_92100 = null;
          d_92100 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, d_92100, trans.const15524, v_92099);
          if(term == null)
            break Fail76254;
          if(true)
            break Success41842;
        }
        term = trans.constNil11;
      }
      z_92099 = term;
      term = b_92100;
      term = termFactory.makeTuple(z_92099, term);
      term = y_92099.invoke(context, term, lifted21633.instance);
      if(term == null)
        break Fail76253;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}