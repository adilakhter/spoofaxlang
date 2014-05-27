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

@SuppressWarnings("all") public class throw_$Declaration$File_1_1 extends Strategy 
{ 
  public static throw_$Declaration$File_1_1 instance = new throw_$Declaration$File_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_92098, IStrategoTerm q_92098)
  { 
    context.push("throw_DeclarationFile_1_1");
    Fail76244:
    { 
      IStrategoTerm t_92098 = null;
      t_92098 = term;
      term = dr_throw_1_2.instance.invoke(context, t_92098, r_92098, q_92098, trans.const15524);
      if(term == null)
        break Fail76244;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}