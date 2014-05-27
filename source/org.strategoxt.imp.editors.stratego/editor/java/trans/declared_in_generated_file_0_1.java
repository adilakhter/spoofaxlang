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

@SuppressWarnings("all") public class declared_in_generated_file_0_1 extends Strategy 
{ 
  public static declared_in_generated_file_0_1 instance = new declared_in_generated_file_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_4747)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference r_4747 = new TermReference(ref_r_4747);
    context.push("declared_in_generated_file_0_1");
    Fail22872:
    { 
      IStrategoTerm d_4748 = null;
      IStrategoTerm z_4747 = null;
      IStrategoTerm b_4748 = null;
      IStrategoTerm c_4748 = null;
      d_4748 = term;
      IStrategoTerm term12242 = term;
      Success12187:
      { 
        Fail22873:
        { 
          term = is_editable_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22873;
          { 
            if(true)
              break Fail22872;
            if(true)
              break Success12187;
          }
        }
        term = term12242;
      }
      IStrategoTerm term12243 = term;
      Success12188:
      { 
        Fail22874:
        { 
          IStrategoTerm term12244 = term;
          Success12189:
          { 
            Fail22875:
            { 
              term = import_cache_path_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22875;
              if(true)
                break Success12189;
            }
            term = get_cache_path_0_0.instance.invoke(context, term12244);
            if(term == null)
              break Fail22874;
          }
          term = $Read$From$File_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22874;
          if(true)
            break Success12188;
        }
        term = parse_file_0_0.instance.invoke(context, term12243);
        if(term == null)
          break Fail22872;
      }
      term = declare_globals_top_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22872;
      lifted6803 lifted68030 = new lifted6803();
      lifted68030.r_4747 = r_4747;
      term = oncetd_1_0.instance.invoke(context, term, lifted68030);
      if(term == null)
        break Fail22872;
      term = d_4748;
      term = base_filename_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22872;
      IStrategoTerm term12245 = term;
      Success12190:
      { 
        Fail22876:
        { 
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22876;
          if(true)
            break Success12190;
        }
        term = term12245;
        IStrategoTerm term12246 = term;
        Success12191:
        { 
          Fail22877:
          { 
            term = is_string_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22877;
            if(true)
              break Success12191;
          }
          term = term12246;
          IStrategoTerm term12247 = term;
          Success12192:
          { 
            Fail22878:
            { 
              term = int_to_string_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22878;
              if(true)
                break Success12192;
            }
            term = term12247;
            IStrategoTerm term12248 = term;
            Success12193:
            { 
              Fail22879:
              { 
                term = real_to_string_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail22879;
                if(true)
                  break Success12193;
              }
              term = term12248;
              IStrategoTerm v_4747 = null;
              IStrategoTerm w_4747 = null;
              IStrategoTerm y_4747 = null;
              v_4747 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail22872;
              if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
                break Fail22872;
              w_4747 = ((IStrategoList)term).tail();
              y_4747 = w_4747;
              term = report_failure_0_2.instance.invoke(context, y_4747, trans.const4525, v_4747);
              if(term == null)
                break Fail22872;
            }
          }
        }
      }
      b_4748 = term;
      z_4747 = trans.const4440;
      c_4748 = b_4748;
      term = string_replace_0_2.instance.invoke(context, c_4748, z_4747, trans.const4526);
      if(term == null)
        break Fail22872;
      term = (IStrategoTerm)termFactory.makeListCons(trans.const4528, termFactory.makeListCons(term, (IStrategoList)trans.constCons2081));
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22872;
      term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil4));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}