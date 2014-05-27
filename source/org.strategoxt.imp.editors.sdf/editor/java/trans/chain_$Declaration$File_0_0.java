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

@SuppressWarnings("all") public class chain_$Declaration$File_0_0 extends Strategy 
{ 
  public static chain_$Declaration$File_0_0 instance = new chain_$Declaration$File_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("chain_DeclarationFile_0_0");
    Fail76257:
    { 
      IStrategoTerm s_92100 = null;
      IStrategoTerm v_92100 = null;
      IStrategoTerm x_92100 = null;
      s_92100 = term;
      x_92100 = term;
      Success41844:
      { 
        Fail76258:
        { 
          IStrategoTerm z_92100 = null;
          z_92100 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, z_92100, trans.const15524, s_92100);
          if(term == null)
            break Fail76258;
          if(true)
            break Success41844;
        }
        term = trans.constNil11;
      }
      v_92100 = term;
      term = x_92100;
      term = termFactory.makeTuple(v_92100, term);
      term = foldl_1_0.instance.invoke(context, term, lifted21635.instance);
      if(term == null)
        break Fail76257;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}